https://cloudgurupayments.medium.com/kubernetes-tutorial-run-deploy-spring-boot-application-in-k8s-cluster-using-yaml-configuration-626882ae7aa5
https://sysdig.com/learn-cloud-native/kubernetes-101/what-is-minikube/
curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-darwin-amd64
sudo install minikube-darwin-amd64 /usr/local/bin/minikube
minikube start
minikube status
eval $(minikube docker-env)
docker images
docker build -t .

kubectl apply -f deployment.yaml
kubectl get deployments
kubectl get pods

kubectl logs spring-boot-k8s-758d886cbc-nsjbr
kubectl logs spring-boot-k8s-758d886cbc-z6jv6

kubectl apply -f service.yaml

kubectl get service or kubectl get svc

kubectl get nodes -o wide

minikube ip
