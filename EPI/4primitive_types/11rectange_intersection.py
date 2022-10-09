# EPI page 35
# Find out weather two rectangles intersect or not, if they do return coordinates.
# Time O(1) | Space O(1)

# Note that this isn't running, need to figure out how named tuples work and 
# how can we pass them in functions
import collections
Rectangle = collections.namedtuple('Rectangle', ('x', 'y', 'width', 'height'))

def intersect_rectangle(R1, R2):
    # First check if the even intersect or not
    def is_intersect(R1, R2):
        intersects_x = (R2.x <= R1.x + R1.width) and (R2.x+width >= R1.x)
        intersects_y = (R2.y <= R1.y + R1.height) and (R2.y+height >= R1.y)
        return intersects_x and intersects_y

    # If they don't intersect, just discard them
    if not is_intersect(R1, R2):
        return Rectangle(0, 0, -1, -1)
    
    x = max(R1.x, R2.x)
    y = max(R1.y, R2.y)
    res_width = min(R1.x + R1.width, R2.x + R2.width) - x
    res_height = min(R2.y + R2.height, R1.y + R1.height) - Y
    return Rectangle(x, y, res_width, res_height)

R1 = Rectangle(20, 20, 20, 20)
R2 = Rectangle(10, 30, 20, 20)
print(intersect_rectangle(R1, R2))