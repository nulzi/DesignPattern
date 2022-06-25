import Computer

class ComputerBuilder:
    __HDD = ""
    __RAM = ""

    __isGPUEnabled = True
    __isBluetoothEnabled = True

    
    def __init__(self, HDD = None, RAM = None):
        self.__HDD = HDD
        self.__RAM = RAM
    
    def setGPUEnabled(self,isGPUEnabled = None):
        self.__isGPUEnabled = isGPUEnabled
        return self.__isGPUEnabled
    
    def setBluetoothEnabled(self, isBluetoothEnabled = None):
        self.__isBluetoothEnabled = isBluetoothEnabled
        return self.__isBluetoothEnabled
    
    def build():
        return Computer(ComputerBuilder)