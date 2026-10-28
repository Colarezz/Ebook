Passo a passo:

1 - Abri o terminal na pasta do projeto: Naveguei até o diretório onde meu projeto do Eclipse estava salvo no computador.

2- Inicializei o Git: Rodei o comando git init para transformar aquela pasta em um repositório Git local.

3 - Adicionei todos os arquivos: Usei o comando git add . para preparar todos os arquivos e pastas do projeto para o envio.

4 - Fiz o commit das alterações: Criei meu primeiro ponto de salvamento executando:
git commit -m "Adicionando códigos das Aulas de Programação e Algoritmo"

5 - Conectei ao meu repositório no GitHub: Vinculei o projeto local ao meu repositório remoto no GitHub usando o comando:
git remote add origin https://github.com/meu-usuario/meu-repositorio.git

6 - Enviei tudo para a nuvem: Subi os arquivos para a branch principal executando:
git branch -M main
git push -u origin main

* Como organizei as pastas e removi a "lixeira" do GitHub
1 - Organizei os arquivos no meu computador: Percebi que a pasta src estava dentro de uma pasta chamada lixeira. Movi a pasta src para a raiz do projeto e apaguei a pasta lixeira localmente.

2 - Apaguei a pasta direto pelo site do GitHub: Como a pasta lixeira já não existia mais no meu computador (o que dava erro ao tentar remover pelo terminal), resolvi direto pela interface web:

3 - Acessei meu repositório no site do GitHub.

4 - Entrei na pasta lixeira.

5 - Cliquei nos três pontinhos (...) e selecionei Delete directory.

6 - Cliquei no botão Commit changes para confirmar e salvar a exclusão.
