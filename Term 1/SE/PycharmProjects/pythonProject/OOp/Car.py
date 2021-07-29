class Car:
    speed = 0
    def __init__(self, year_model, make):
        self.__year_model = year_model
        self.__make = make
        self.__speed = 0

    def set_year_model(self, year_model):
        self.__year_model = year_model

    def set_make(self, make):
        self.__make = make

    def set_speed(self, speed):
        self.__speed = speed

    def get_year_model(self):
        return self.__year_model

    def get_make(self):
        return self.__make

    def get_speed(self):
        return self.__speed

    def accelerate(self):
        self.__speed += 5

    def brake(self):
        self.__speed -= 5
        if (self.__speed<0):
            self.__speed = 0

if __name__ == '__main__':

    Car = Car(2000, 'Rain')

    print()
    print('Accelerate')
    #1
    Car.accelerate()
    print(Car.get_speed())
    #2
    Car.accelerate()
    print(Car.get_speed())
    #3
    Car.accelerate()
    print(Car.get_speed())
    #4
    Car.accelerate()
    print(Car.get_speed())
    #5
    Car.accelerate()
    print(Car.get_speed())

    print()
    print('Brake')
    # 1
    Car.brake()
    print(Car.get_speed())
    # 2
    Car.brake()
    print(Car.get_speed())
    # 3
    Car.brake()
    print(Car.get_speed())
    # 4
    Car.brake()
    print(Car.get_speed())
    # 5
    Car.brake()
    print(Car.get_speed())
