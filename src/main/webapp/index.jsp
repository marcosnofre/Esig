
    <p:panel id="horizontal" header="Listagem de Tarefa" toggleable="true" toggleOrientation="horizontal">
        <h:panelGrid columns="2" cellpadding="10">

            <h:outputLabel value="Numero"></h:outputLabel>
            <h:inputText value=""></h:inputText>

            <h:outputLabel value="Titulo/Descrição"></h:outputLabel>
            <h:inputTextarea value=""></h:inputTextarea>


        </h:panelGrid>

        <h:panelGrid columns="5" cellpadding="10">
            <h:outputLabel value="Responsável"></h:outputLabel>
            <h:selectOneMenu value = "">
                <f:selectItem itemValue = "0" itemLabel = "Selecione" />
                <f:selectItem itemValue = "1" itemLabel = "Marcos" />
                <f:selectItem itemValue = "2" itemLabel = "Rafael" />
            </h:selectOneMenu>
            <h:outputLabel value="Situação"></h:outputLabel>
            <h:selectOneMenu value = "">
                <f:selectItem itemValue = "0" itemLabel = "Selecione" />
                <f:selectItem itemValue = "1" itemLabel = "Baixa" />
                <f:selectItem itemValue = "2" itemLabel = "Alta" />
            </h:selectOneMenu>
            <h:commandButton type="submit" value="Buscar Tarefas">
            </h:commandButton>

        </h:panelGrid>

        <h:dataTable value = "" var = "Tarefas"
                     styleClass = "TarefasTable"
                     headerClass = "TarefasTableHeader"
                     rowClasses = "TarefasTableOddRow,TarefasTableEvenRow">

            <h:column>
                <f:facet name = "header">Numero</f:facet>
                123
            </h:column>

            <h:column>
                <f:facet name = "header">Titulo</f:facet>
                Tarefa
            </h:column>

            <h:column>
                <f:facet name = "header">Responsaveis</f:facet>
                Marcos
            </h:column>

            <h:column>
                <f:facet name = "header">Ações</f:facet>
                Editar | Excluir | Concluir
            </h:column>
        </h:dataTable>
    </p:panel>
