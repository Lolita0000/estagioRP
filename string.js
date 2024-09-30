function contarLetraA(s) {
    let contador = 0; // Inicializa o contador

    // Percorre cada caractere da string
    for (let letra of s) {
        // Verifica se o caractere é 'a' ou 'A'
        if (letra.toLowerCase() === 'a') {
            contador++; // Incrementa o contador se encontrar 'a' ou 'A'
        }
    }

    return contador; // Retorna a quantidade encontrada
}

// Solicita ao usuário que insira uma string
const entrada = prompt("Digite uma string para verificar a letra 'a':");

// Chama o método para contar a letra 'a'
const quantidadeA = contarLetraA(entrada);

// Exibe o resultado
if (quantidadeA > 0) {
    console.log(`A letra 'a' (maiúscula ou minúscula) aparece ${quantidadeA} vez(es) na string.`);
} else {
    console.log("A letra 'a' (maiúscula ou minúscula) não foi encontrada na string.");
}