def input_len():
    value = float(input("enter the length : "))
    return value


def input_wid():
    values = float(input("enter the width : "))
    return values


def calc(value, values):
    per = (value + values) * 2
    return per


def cal(value, values):
    area = value * values
    return area


if __name__ == '__main__':
    a = input_len()
    b = input_wid()
    c = calc(a, b)
    d = cal(a, b)
    print("the length you entered is ", a, )
    print("the width you entered is ", b, )
    print("the area is", d, )
    print("the perimeter is ", c, )
