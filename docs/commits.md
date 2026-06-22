# PADRÕES DE COMMITS
Explicando como padronizar as mensagens dos commits.

- no padrão de commits, o uso do verbo no presente do indicativo ("organiza", "adiciona", "configura") é considerado o formato ideal e o mais recomendado pelo mercado!
* cada commit deve focar em uma única tarefa ou contexto.
* evite misturar alterações de tipos diferentes em um único commit.
* se acumular muitas mudanças, adicione os arquivos por partes em vez de usar "git add .".


## feat
* usado quando adicionamos uma nova funcionalidade no código.

## docs
* usado para alterações exclusivas na documentação (arquivos .md).

## chore
* mudanças de rotina que não alteram o código principal (pastas, .gitignore).

## fix
* usado para correção de erros, bugs ou falhas no código.

## refactor
* usado para reescrever ou melhorar o código sem alterar o que ele faz.

## style
* usado para formatação e estética do código que não alteram a lógica (espaços, ponto e vírgula, indentação).

## test
* usado quando criamos ou corrigimos testes automatizados.



## CONSULTA
Consulte o tipo de alteração que você fez para usar o prefixo correto.

#### nova função: "feat: mensagem no presente"
#### documentação: "docs: mensagem no presente"
#### faxina/configurações: "chore: mensagem no presente"
#### consertar bug: "fix: mensagem no presente"
#### melhorar código existente: "refactor: mensagem no presente"
#### formatação/estética: "style: mensagem no presente"
#### testes: "test: mensagem no presente"