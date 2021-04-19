# https://leetcode.com/problems/defanging-an-ip-address/

address = input()
for ch in address:
    print("[.1.]" if ch=='.' else ch, end='')