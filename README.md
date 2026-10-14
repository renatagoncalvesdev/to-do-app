## Aluna: Renata do Nascimento Gonçalves

## Data de entrega: 14/10/2026
## Justificativa do tema
Escolhi uma Lista de Tarefas minimalista, pensada para pessoas com TDAH e TEA organizarem a rotina sem se sentirem sobrecarregadas por estímulos. A interface é simples, com poucos elementos por tela. O principal desafio técnico foi traduzir o wireframe em estados e navegação funcionais.
## Como o aplicativo funciona
**Tela 1: Minhas tarefas**- Campo "Nova tarefa" e botão "+" para cadastrar.- Lista com todas as tarefas salvas.- Checkbox para marcar como concluída (o título fica riscado).- Botão "X" para excluir.- Tocar numa tarefa abre os detalhes.
**Tela 2: Detalhes da tarefa**- Mostra o título e o status (concluída ou pendente).- Campo de descrição, com botão "Salvar descrição".- Botão "Voltar" para retornar à lista.
Os dados ficam salvos no celular: ao fechar e abrir o app, as tarefas continuam lá.
## Tecnologias
- Kotlin- Jetpack Compose (interface)- Navigation Compose (navegação entre telas)- Room (banco de dados local)- Arquitetura MVVM
## Organização do código
- `data/`: `Task` (entidade), `TaskDao`, `AppDatabase`, `TaskRepository`- `viewmodel/`: `TaskViewModel`- `ui/screens/`: `TaskListScreen`, `TaskDetailScreen`- `ui/navigation/`: `AppNavigation`
## Observações
- Os nomes no código estão em inglês, seguindo a convenção da área. Os textos exibidos no app estão em português.- No planejamento inicial, as variáveis de estado seriam apenas `remember { mutableStateOf() }`. Na versão final, a lista de tarefas vem do banco Room, e `textoNovaTarefa` virou `newTaskText`.- Melhoria futura: dividir cada tarefa em pequenas etapas (subtarefas), para ajudar ainda mais no foco.