angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function($scope, $filter, uppercaseFilter, contatosAPI, operadorasAPI) {
	$scope.app = "Lista Telefonica";
	
	$scope.contatos = [];
	$scope.operadoras = [];

	$scope.adicionarContato = function(contato) {
		contato.data = new Date();
		contatosAPI.saveContato(contato).success(function(data) {
			delete $scope.contato;
			$scope.contatoForm.$setPristine();
			carregarContatos();
		}).error(function(data, status) {
			$scope.message = "Aconteceu um problema: " + data;
		});
	};
	$scope.apagarContatos = function(contatos) {
		console.log(contatos);
		$scope.contatos = contatos.filter(function(contato) {
			if (!contato.selecionado) {
				return contato;
			}
		});
	};
	$scope.isContatoSelecionado = function(contatos) {
		return contatos.some(function(contato) {
			return contato.selecionado;
		});
	};
	$scope.ordenarPor = function(campo) {
		$scope.criterioDeOrdenacao = campo;
		$scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao
	}

	var carregarContatos = function() {
		contatosAPI.getContatos().success(function(data) {
			$scope.contatos = data;
		}).error(function(data, status) {
			$scope.message = "Não foi possível carregar os dados!";
		});
	};

	var carregarOperadoras = function() {
		operadorasAPI.getOperadoras().success(function(data) {
			$scope.operadoras = data;
		}).error(function(data, status) {
			$scope.message = "Não foi possível carregar os dados!";
		});
	};

	carregarContatos();
	carregarOperadoras();
});