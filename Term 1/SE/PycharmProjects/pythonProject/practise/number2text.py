# Program: Read Vietnamese Money
# Course: HANU-FIT-SS1: Python programming
# Author: Hung Ta
#============================================================================
def ret_0word(order):
    return {0: "", 1: "", 2: "Không"}[order]
def ret_1word(order):
    return {0: "Một", 1: "", 2: "Một"}[order]
def ret_word(num, order):
    return {"0": ret_0word(order), "1": ret_1word(order), "2":"Hai", "3":"Ba", "4":"Bốn", "5":"Lăm" if (order == 0) else "Năm", "6":"Sáu", "7":"Bảy", "8":"Tám", "9":"Chín"}[num]
def ret_1connect(val):
    temp = ""
    if val == 0: temp = "Lẻ"
    elif val == 1: temp = "Mười"
    else: temp = "Mươi"
    return temp
def ret_connect(pos, val):
    return {2:"Trăm", 1: ret_1connect(val), 0: ""}[pos]
def ret_group(pos):
    return {3:"Tỷ", 2:"Triệu", 1:"Ngàn", 0:""}[pos]
def convert_group3(str_group3):
    str_group = str_group3[::-1]  # convert num to str, revert
    msg_temp = ["","","","","",""]
    msg = ""
    for idx in range(len(str_group)-1, -1, -1):                                     # add all text, then check relation
        msg_temp[idx*2+1] = ret_word(str_group[idx], idx)
        msg_temp[idx*2] = ret_connect(idx, int(str_group[idx]))
    if len(str_group) > 1:
        if (str_group[0] == "0") & (str_group[1] == "0"):                           # chuc And donvi =0
            for rd in range(0, 3):                                                  # clear all text for chuc and donvi
                msg_temp[rd] = ""
        if (str_group[0] == "1") & (str_group[1] != "1") & (str_group[1] != "0"):   # chuc !=1, then donvi = Mốt
            msg_temp[1] = "Mốt"
    for id in range(5, 0, -1):
        msg += msg_temp[id]
    return msg
def add_zero2group(str_num, ismiddle): # add more zero for the middle group
    return str_num.zfill(3) if ismiddle else str_num
def fix_typos(strmsg): # fix typos for Upper and space
    strtemp = strmsg[0]
    idx = 1
    while idx < len(strmsg):
        if strmsg[idx].isupper():
            strtemp += " " + strmsg[idx].lower()
        else: strtemp += strmsg[idx].lower()
        idx += 1
    return strtemp + " đồng chẵn"
#============================================================================
def main():
    # Local variables
    idx_group = [0, 3, 6, 9]   # list use for group separation
    int_money = 0           # define variable
    str_money = ''          # keep the message
    # --------------------------------------
    while True: #Keep getting input from the user
        try:
            int_money = int(input('Input money smaller than 1000 billion VND: '))
            if int_money > 999999999999:
                print('Number is too big, please re-input the money!')
                continue
            elif int_money == 0:
                print('Number is 0, please re-input the money!')
                continue
            else: break
        except ValueError:
            print('Conversion error, please re-input the money!')
            continue
    # --------------------------------------
    max_group = -(-len(str(int_money))//3)      # get ceiling(length(int_money))
    int_group = max_group
    int_dividend = int_money
    while int_group > 0:
        divisor = 10**idx_group[int_group-1]
        int_div = int_dividend // divisor
        if int_div > 0:
            str_money += convert_group3(add_zero2group(str(int_div), int_group < max_group)) + ret_group(int_group-1)
        else:
            int_group -= 1
            continue
        int_group -= 1
        int_mod = int_dividend % divisor
        if int_mod > 0:
            int_dividend = int_mod
        else: break
    print('============================================================================================================')
    print('(:-)', fix_typos(str_money))  # Test: 752344792703, 101121001450, 10010230111, 1000000, 100101231022
    print('============================================================================================================')
#=====================================================
main()