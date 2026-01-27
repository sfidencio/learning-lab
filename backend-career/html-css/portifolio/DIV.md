# Quando utilizar `<div>`

A tag `<div>` define uma divisão genérica no documento HTML e costuma ser usada como **contêiner** para agrupar outros elementos. Isso ajuda a organizar o layout e aplicar estilos via CSS (e também selecionar/manipular via JavaScript).

Use `<div>` quando você precisa **agrupar elementos** e **não existe uma tag semântica apropriada** para representar aquele bloco.

---

## Por que `<div>` não possui valor semântico?

Dizer que a `<div>` **não tem valor semântico** significa que ela **não descreve o papel do conteúdo** que está dentro dela.

- Para o navegador, leitores de tela (acessibilidade) e mecanismos de busca (SEO), uma `<div>` é apenas:  
  **“um bloco genérico”**.
- Ela **não comunica intenção**, como “navegação”, “conteúdo principal”, “rodapé”, “artigo”, etc.

Em outras palavras: a `<div>` **não dá significado**, apenas **estrutura visual/organizacional**.

---

## Diferença entre `<div>` e tags semânticas

### ✅ Tags semânticas (com significado)
Exemplos: `<header>`, `<main>`, `<nav>`, `<section>`, `<article>`, `<footer>`, `<aside>`.

Elas informam *o que aquele bloco representa*:

- **Acessibilidade:** leitores de tela conseguem identificar regiões (ex.: “navegação”).
- **SEO:** buscadores entendem melhor a estrutura e a relevância do conteúdo.
- **Manutenção:** o HTML fica mais legível para pessoas.

Exemplo:
```html
<header>
  <h1>Meu Portfólio</h1>
</header>

<nav>
  <a href="#projetos">Projetos</a>
</nav>

<main>
  <section id="projetos">
    <h2>Projetos</h2>
  </section>
</main>

<footer>
  <p>Contato: email@exemplo.com</p>
</footer>
```

### ✅ `<div>` (sem significado)
A `<div>` é indicada quando o bloco é apenas “uma caixa” para layout/estilo, sem representar uma seção semântica do documento.

Exemplos comuns de uso:
- wrappers: `.container`, `.wrapper`
- grids/colunas: `.row`, `.col`
- cards: `.card`
- agrupamentos para estilo: `.highlight`, `.box`

Exemplo:
```html
<div class="cards">
  <div class="card">Projeto 1</div>
  <div class="card">Projeto 2</div>
</div>
```

---

## Regra prática

- Se o bloco **tem função/papel** no conteúdo da página → prefira **tag semântica**.
- Se o bloco é só para **agrupamento visual/estilização** e não há tag melhor → use **`<div>`**.

---

## Documentação oficial

- MDN: `<div>` — https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div
- MDN: Elementos semânticos — https://developer.mozilla.org/en-US/docs/Glossary/Semantics
- WHATWG HTML — https://html.spec.whatwg.org/