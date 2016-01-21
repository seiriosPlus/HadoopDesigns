#顺序查找
def SequentialSearch(nums,key):
    for i in range(len(nums)):
        if key == nums[i]:
            return i
    return -1
