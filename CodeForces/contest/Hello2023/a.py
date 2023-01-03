css = int(input())

for _ in range(css):
    len = int(input())
    layout = input()
    if "RL" in layout:
        print(0)
    elif "LR" in layout:
        print(layout.find("LR")+1)
    else:
        print(-1)