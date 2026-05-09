class car:
    def open_close_door(self):
        print("Door is opened")
        print("Engine to start")
        self._internal()

    def _internal(self):
        print("This is internal method")
        self.__engine()
        
    def __engine(self):
        print("Engine is private method")
        
my_car = car()
my_car.open_close_door()