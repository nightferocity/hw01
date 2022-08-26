# hw01
docker build -f Dockerfile -t hw01-docker .

docker run -p 8033:8033 -e ARGS="--greet=Я/МыУспели"  hw01-docker 

result

![изображение](https://user-images.githubusercontent.com/39415841/186971815-1338ba8e-ad0a-4d4c-bebd-782ede158161.png)


 docker run --rm -p 8033:8033 -e ARGS="--greet=hello-ma-friend"  hw01-docker 

![изображение](https://user-images.githubusercontent.com/39415841/186972195-b71f5b24-fbd5-4396-8d91-93f8fe9404bf.png)
