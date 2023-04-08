import view
class Menu:

    def __init__(self, menu_items: list) -> None:
        self.menu_items = {str(key): val for key, val in enumerate(menu_items, 1)}
        self.view = view.View()

    def show(self):
        for k, v in self.menu_items.items():
            self.view.print_message(f'{k} - {v}')
        return 
    
    def get_user_choice(self):
        while True:
            self.show()
            k = self.view.get_user_input('Ваш выбор: ')
            if k in self.menu_items.keys(): return k
            else: print("Неверный ввод!")