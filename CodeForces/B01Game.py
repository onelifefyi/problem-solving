# https://codeforces.com/problemset/problem/1373/B

''' Note: replace() replaces all the occurence,
          ensure that additional parameter is checked of replace() (use help(str.replace))
'''


css = int(input())
for _ in range(css):
    text = input()
    turn = 0
    while True:
        #print(text)
        if '01' in text:
            turn += 1
            text = text.replace('01', '', count=1)
            continue
        elif '10' in text:
            turn += 1
            text = text.replace('10', '', count=1)
            continue
        break

    result = 'DA' if turn%2 == 1 else 'NET'
    print(result)