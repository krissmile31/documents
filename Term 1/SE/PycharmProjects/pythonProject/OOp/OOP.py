class Student:
    def __init__(self, id, name, gender, height):
        self.id = id
        self.name = name
        self.gender = gender
        self.height = height

    def method(self):
        print(self.id, '\t', self.name, '\t', self.gender, '\t\t', self.height)

if __name__ == '__main__':
    a = Student(56, 'anh', 'female', 160)
    b = Student(31, 'chan', 'male', 152)
    c = Student(26, 'nga', 'female', 162)
    a.method()
    b.method()
    c.method()
