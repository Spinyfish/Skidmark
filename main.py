import shutil

for i in range(10000):
	shutil.copyfile("./wood.png", f"./alan-{i}.png")