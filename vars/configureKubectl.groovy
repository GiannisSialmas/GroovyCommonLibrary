#!/usr/bin/env groovy

// This function configures the kubectl to access your cluster.
// You pass the cluster master ip, clusterToken, and namespace as named arguments
// Another way to do this

def call(Map args) {
	
	sh "kubectl config set clusters.default.server ${args.clusterIp}";
	sh "kubectl config set clusters.default.insecure-skip-tls-verify true";
	sh "kubectl config set users.default.token ${args.clusterToken}";
	sh "kubectl config set contexts.default.cluster default";
	sh "kubectl config set contexts.default.user default";
	sh "kubectl config use-context default";
	sh "kubectl config set-context --current --namespace=${args.namespace}"

}
