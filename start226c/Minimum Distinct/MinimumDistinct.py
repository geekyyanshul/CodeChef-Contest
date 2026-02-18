import sys
from collections import Counter

def a():
    b = sys.stdin.read().split()
    
    if not b:
        return

    c = iter(b)
    
    try:
        d = int(next(c))
    except StopIteration:
        return

    e = []

    for _ in range(d):
        try:
            f = int(next(c))
            g = int(next(c))
            
            h = []
            for _ in range(f):
                h.append(int(next(c)))
            
            i = Counter(h)
            
            j = h[0]
            
            k = len(i)
            
            l = []
            for m, n in i.items():
                if m != j:
                    l.append(n)
            
            l.sort()
            
            o = 0
            for p in l:
                if g >= p:
                    g -= p
                    o += 1
                else:
                    break
            
            e.append(str(k - o))
            
        except StopIteration:
            break

    print('\n'.join(e))

if __name__ == '__main__':
    a()
