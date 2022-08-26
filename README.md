# hw01
docker build -f Dockerfile -t hw01-docker .

docker run -p 8033:8033 -e ARGS="--greet=Я/МыУспели"  hw01-docker 

result

![изображение](https://user-images.githubusercontent.com/39415841/186971815-1338ba8e-ad0a-4d4c-bebd-782ede158161.png)
