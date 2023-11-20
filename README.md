# CD - Prática - 06-11-2023

Criação do Web-service Client para consumir o SOAP Server que tínhamos criado na ultima aula com o Eclipse. 

## Paços eclipse web service client

1. Novo Dynamic Web Project
2. New Web Service Client (Right click project name -> new -> Web Services -> Web Service Client)
	1. Copiar URL para WSDL Math Utility
3. Meter MathConsumer na package extraída (Right Click em cima da MathConsumer class -> Run As -> Java Aplication)
	1. Mudar o URL no código
	2. Run as 


### Preparamos ambiente para o web service chamar rmi method a partir do mesmo package
1. Colocamos o MathUtility no default package
2. Criamos metodos AddServer Rmi que fizemos antes nas aula
3. Alterar methodo SOAP add para chamar metodo rmi add

Tive que trocar no AddServer, do linux o meu host, para receber ints 


http://127.0.0.1:8080/MathUtilityWithRMI/services/MathUtilityPort?wsdl



# CD - Prática - 13-11-2023

Continuação da ultima aula

Tarefa: Chamar metodo add do RMI Server de forma a ser consumido pelo Microservice SOAP

Acrescentar codigo addclient no mathutility na funcao addintegers


# CD - Pratica - 20-11-2023


## REST Webservice

### StudentWebServiceREST_Server

- Criação e importação do projecto.
- Ficheiros xml -> src/main/webapp/**WEB-INF**/
- ficheiros do Server no package com.student

Adicionar CXF ao projecto
- Botao direiro no projecto 
- Properties
- Java Build Path
- Select Classpath
- Add Library
- CXF Runtime

Por fim: (Botao direito no projecto) -> Run as -> Run on server

### StudentWebServiceREST_Client

Mesmos passos para adicionar CXF ao projecto

- Package com.client
- importa ficheiros client

Por fim, com o server a correr, 

Botão direito: 
- Em cima de cada ficheiro 
- Run As -> Java Application

