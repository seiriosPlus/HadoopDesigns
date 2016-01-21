
def BinarySearch(nums,low,high,key):
    print u'{},{},{},{}'.format(nums,low,high,key)
    if low>high:
        print -1
        return

    middle = (low + high)/2

    if nums[middle] == key:
        print middle
        return

    elif nums[middle] < key:
        BinarySearch(nums,middle+1,high,key)

    else:
        BinarySearch(nums,low,middle-1,key)

if __name__=="__main__":
    nums = [1,3,5,7,9,11]

    BinarySearch(nums,0,5,100)
