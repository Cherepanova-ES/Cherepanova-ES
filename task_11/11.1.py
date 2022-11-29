from tkinter import *
import json
import requests


def get_json():
    with open("C:/Users/katy/Desktop/my.json.txt", "w") as file:
        username = txt.get()
        url = f"https://api.github.com/users/{username}"
        user_data = requests.get(url).json()
        keys = ['company', 'created_at', 'email', 'id', 'name', 'url']
        data = user_data.keys()
        for i in data:
            if i in keys:
                file.write(f"{i}:{user_data[i]}" + '\n')


window = Tk()
window.title("Введите имя репозитория на Githab")
window.geometry('500x400')
txt = Entry(window, width=20)
txt.grid(column=0, row=0)
btn = Button(window, text="Нажмите на кнопку и закройте окно!", command=get_json)
btn.grid(column=1, row=0)
window.mainloop()

