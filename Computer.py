class Computer:
    __HDD = ""
    __RAM = ""

    __isGPUEnabled = True
    __isBluetoothEnabled = True
    
    def __init__(self, builder):
        self.__HDD = builder.HDD
        self.__RAM = builder.RAM
        self.isGPUEnabled = builder.isGPUEnabled
        self.isBluetoothEnabled = builder.isBluetoothEnabled

    def getHDD(self):
        return self.__HDD
    
    def getRAM(self):
        return self.__RAM
    
    def isGPUEnabled(self):
        return self.__isGPUEnabled
    
    def isBluetoothEnabled(self):
        return self.__isBluetoothEnabled

    # @staticmethod
    class ComputerBuilder:
        __HDD = ""
        __RAM = ""

        __isGPUEnabled = None
        __isBluetoothEnabled = None

        def __init__(self, HDD = None, RAM = None):
            self.__HDD = HDD
            self.__RAM = RAM
        
        def setGPUEnabled(self, isGPUEnabled = None):
            self.__isGPUEnabled = isGPUEnabled
            return self
        
        def setBluetoothEnabled(self, isBluetoothEnabled = None):
            self.__isBluetoothEnabled = isBluetoothEnabled
            return self
        
        def build(self):
            return Computer(builder=self)