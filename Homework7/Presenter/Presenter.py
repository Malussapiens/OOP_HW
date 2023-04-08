import sys
sys.path.insert(
    0, "c:\\Users\\Asus\\Documents\\Обучение GeekBrains\\repo\\OOP\\OOP_HW\\Homework7\\View")
sys.path.insert(
    0, "c:\\Users\\Asus\\Documents\\Обучение GeekBrains\\repo\\OOP\\OOP_HW\\Homework7\\Model")
import Calc
import view
import menu

def run():
    # exp_str = '15/(7-(1+1))*3-(2+(1+1))*15/(7-(200+1))*3-(2+(1+1))*(15/(7-(1+1))*3-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1)))'
    # res = -30.072164948453608
    calc = Calc.Calculator()
    my_view = view.View()

    main_menu_items = ["Вычислить выражение", "Задать точность", "Выход"]
    my_menu = menu.Menu(main_menu_items)

    n_digits = 15

    while True:
        choice = my_menu.get_user_choice()
        if choice == '1':
            exp_str = my_view.get_user_input('Введите выражение: ')
            my_view.print_message(
                f'Результат: {round(calc.calculate(exp_str), n_digits)}')
        elif choice == '2':
            while True:
                choice = my_view.get_user_input(
                    'Введите кол-во знаков после запятой: ')
                if choice.isdecimal():
                    choice = int(choice)
                    if choice >= 0:
                        n_digits = choice
                        break
                else:
                    my_view.print_message('Введите положительное число!')
        elif choice == '3':
            my_view.print_message('До новых встреч!')
            break
