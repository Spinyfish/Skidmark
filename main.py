import shutil

for i in range(10000):
	shutil.copyfile("./wood.png", f"./wood-{i}.png")