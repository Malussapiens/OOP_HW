import sys
sys.path.insert(
    0, "c:\\Users\\Asus\\Documents\\Обучение GeekBrains\\repo\\OOP\\OOP_HW\\Homework7\\Model")
sys.path.insert(
    0, "c:\\Users\\Asus\\Documents\\Обучение GeekBrains\\repo\\OOP\\OOP_HW\\Homework7\\View")
import menu
import view
import Calc

# exp_str = '15/(7-(1+1))*3-(2+(1+1))*15/(7-(200+1))*3-(2+(1+1))*(15/(7-(1+1))*3-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1)))'
# res = -30.072164948453608
calc = Calc.Calculator()
view = view.View()

main_menu_items = ["Вычислить выражение", "Задать точность", "Выход"]
my_menu = menu.Menu(main_menu_items)

while True:
    choice = my_menu.get_user_choice()
    if choice == '1':
        exp_str = view.get_user_input('Введите выражение: ')
        view.print_message(f'Результат: {calc.calculate(exp_str)}')
    elif choice == '2':
        pass
    elif choice == '3':
        view.print_message('До новых встреч!')
        break
