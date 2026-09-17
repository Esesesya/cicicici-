def f(x):
    return x**3 - x - 2
def bisectie(a, b, eps):
    while (b - a) / 2 > eps:
        c = (a + b) / 2
        if f(a) * f(c) < 0:
            b = c
        else:
            a = c
    return (a + b) / 2

a, b, eps = 1.0, 2.0, 0.0001
wortel = bisectie(a, b, eps)

print(f'Gevonden wortel: x ≈ {wortel:.6f}')
print(f'Controle f(x) = {f(wortel):.10f}')