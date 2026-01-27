# 🧩 `z-index` (CSS)

Controla a sobreposição visual de elementos via `z-index`.

## 🧠 O que é `z-index`
`z-index` define a ordem de empilhamento (quem fica “por cima”) **dentro do mesmo contexto de empilhamento**
(*stacking context*). Valores maiores tendem a aparecer acima de valores menores, mas **somente quando os
elementos estão no mesmo contexto**.

## ✅ Pré-requisitos para o `z-index` funcionar
- Em geral, o elemento precisa estar “posicionado”: `position: relative | absolute | fixed | sticky`.
  - Para `position: static`, o `z-index` normalmente **não** surte efeito.
- `z-index` **não é global**: ele depende do contexto de empilhamento em que o elemento está inserido.

Exemplo mínimo:
```css
.card {
  position: relative;
  z-index: 10;
}
```

## 🧱 Contexto de empilhamento (*stacking context*)
Um novo contexto pode ser criado por diversas propriedades no ancestral, por exemplo:
- `position` + `z-index` (quando `z-index` não é `auto`)
- `opacity < 1`
- `transform`, `filter`, `perspective`
- `will-change`, `mix-blend-mode`
- `isolation: isolate`
- Alguns cenários com `flex`/`grid` e `z-index` também influenciam a ordem

➡️ Isso significa que um filho com `z-index: 9999` **não necessariamente** ficará acima de um elemento fora
desse contexto se o ancestral dele “prendeu” o empilhamento.

## 🧰 Boas práticas de mercado
- 📏 **Padronize uma escala de camadas** (ex.: base, header, dropdown, modal, toast) ao invés de números aleatórios.
- 🧾 **Evite valores gigantes** (`999999`): prefira um sistema consistente (tokens/variáveis) para facilitar manutenção.
- 📝 **Documente as camadas** e a intenção: ajuda a prevenir “guerra de z-index” entre componentes.
- 🧨 **Minimize stacking contexts acidentais** (ex.: aplicar `transform` só para “hack” visual pode quebrar overlays).
- 🧩 **Use portais/overlays fora do fluxo** (ex.: modais/toasts renderizados no final do `<body>`) para reduzir conflitos.
- ⚠️ **Cuidado com `z-index` negativo**: pode tornar o elemento inacessível (cliques/foco) e gerar bugs de acessibilidade.

## 🕵️ Dica de depuração
Se o `z-index` “não funciona”, verifique:
1. Se o elemento está posicionado (`position`).
2. Qual ancestral criou um *stacking context*.
3. Se há overlays/headers fixos competindo.

## 🧪 Exemplos práticos (uso do `z-index`)

### 1) Sobreposição simples (mesmo contexto)
```html
<div class="box box-a"></div>
<div class="box box-b"></div>
```

```css
.box {
  position: absolute;
  width: 120px;
  height: 120px;
}

.box-a {
  top: 20px;
  left: 20px;
  background: #3b82f6;
  z-index: 1;
}

.box-b {
  top: 60px;
  left: 60px;
  background: #ef4444;
  z-index: 2; /* fica por cima */
}
```

### 2) Header fixo vs Modal (camadas previsíveis)
```html
<header class="header">Header</header>

<div class="backdrop"></div>
<div class="modal" role="dialog" aria-modal="true">
  <h2>Modal</h2>
</div>
```

```css
.header {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  height: 56px;
  background: #111827;
  color: #fff;
  z-index: 10;
}

/* overlay deve ficar acima do header */
.backdrop {
  position: fixed;
  inset: 0;
  background: rgba(0, 0, 0, 0.5);
  z-index: 100;
}

.modal {
  position: fixed;
  inset: 0;
  margin: auto;
  width: min(560px, calc(100vw - 32px));
  height: fit-content;
  padding: 16px;
  background: #fff;
  border-radius: 8px;
  z-index: 110; /* acima do backdrop */
}
```

### 3) “`z-index` não funciona”: *stacking context* prendendo o filho
```html
<div class="panel">
  <div class="tooltip">Tooltip</div>
</div>

<div class="outside">Fora do panel</div>
```

```css
.panel {
  position: relative;
  transform: translateZ(0); /* cria stacking context */
  z-index: 1;
}

.tooltip {
  position: absolute;
  top: -10px;
  left: 0;
  z-index: 9999; /* alto, mas ainda “preso” no context do .panel */
  background: gold;
  padding: 8px;
}

.outside {
  position: relative;
  z-index: 2; /* pode ficar por cima do tooltip dependendo da árvore/contextos */
  background: #e5e7eb;
  margin-top: 40px;
}
```

**Como resolver (ideias comuns):**
- renderizar tooltip/modal fora do contêiner que cria stacking context (ex.: no final do `<body>`);
- remover `transform/opacity/filter` do ancestral quando não for necessário;
- ajustar `z-index` entre **contextos** (ex.: elevar o `z-index` do próprio ancestral que cria o contexto).

## 📌 `position` (CSS) — o básico (pra quem está começando)

`position` define **como o elemento é posicionado** na página e **se** propriedades como `top/right/bottom/left` e `z-index` vão fazer sentido.

### ✅ Tipos de `position` (o que cada um faz)

#### 1) `position: static` (padrão)
- É o padrão de todo elemento.
- **Ignora** `top/right/bottom/left`.
- `z-index` geralmente **não funciona** aqui.

```css
.box {
  position: static; /* padrão */
  z-index: 10;      /* normalmente não surte efeito */
}
```

#### 2) `position: relative`
- O elemento **continua ocupando espaço** no layout normal.
- Você pode “empurrar visualmente” com `top/left/...`.
- Muito usado para:
  - habilitar `z-index`;
  - servir de referência para um filho `absolute`.

```css
.card {
  position: relative;
  z-index: 1;
  top: 10px; /* move visualmente, mas o espaço original continua reservado */
}
```

#### 3) `position: absolute`
- O elemento **sai do fluxo normal** (não reserva espaço).
- Ele é posicionado em relação ao **ancestral mais próximo que NÃO seja `static`** (ex.: `relative/absolute/fixed/sticky`).
- Se não existir ancestral “posicionado”, ele usa a página (viewport/documento) como referência.

```html
<div class="container">
  <span class="badge">Novo</span>
</div>
```

```css
.container {
  position: relative; /* referência para o absolute do filho */
  padding: 24px;
  border: 1px solid #ddd;
}

.badge {
  position: absolute;
  top: 8px;
  right: 8px;
  z-index: 2;
}
```

#### 4) `position: fixed`
- Também sai do fluxo normal.
- Fica preso à **viewport** (tela), não “rola” com o conteúdo.
- Ex.: header fixo, botão flutuante, modal/backdrop.

```css
.fab {
  position: fixed;
  right: 16px;
  bottom: 16px;
  z-index: 1000;
}
```

#### 5) `position: sticky`
- Mistura `relative` + `fixed`.
- Ele fica no fluxo normal, mas “gruda” quando atinge um limite (ex.: `top: 0`).
- Precisa de um valor de `top/left/...` para “ativar”.
- O sticky depende do contêiner de rolagem (às vezes “não funciona” por overflow do pai).

```css
.section-title {
  position: sticky;
  top: 0;
  background: white;
  z-index: 5;
}
```

### 🔗 Como isso se conecta com `z-index`
- `z-index` define “quem fica por cima”, mas normalmente **só funciona** quando o elemento tem `position` diferente de `static` (ou em alguns casos específicos como itens flex/grid).
- Se o `z-index` “não funcionar”, as causas mais comuns são:
  1) o elemento está `static`;
  2) existe um *stacking context* prendendo o empilhamento (ex.: `transform` no pai).

## 🟰 Quando os 2 `z-index` “empatam”?

**Empate** = dois elementos estão **no mesmo contexto de empilhamento (stacking context)** e têm o **mesmo valor de `z-index`** (ex.: ambos `z-index: 10`).

### ✅ Regra prática (mais comum)
Se os dois elementos:
- são “comparáveis” (mesmo contexto), e
- têm o mesmo `z-index`, e
- estão no mesmo nível (irmãos ou disputando a mesma camada),

👉 **o elemento que aparece por último no HTML (mais “embaixo” no DOM) tende a ser pintado por cima**.

### 🧪 Exemplo (empate resolvido pela ordem no HTML)
```html
<div class="a">A</div>
<div class="b">B</div>
```

```css
.a, .b {
  position: relative;
  width: 120px;
  height: 120px;
}

.a {
  background: #3b82f6;
  z-index: 10;
}

.b {
  background: #ef4444;
  z-index: 10; /* mesmo z-index */
  margin-top: -60px; /* só pra sobrepor visualmente */
}
/* Resultado típico: .b fica por cima (vem depois no HTML) */
```

### ⚠️ Quando “parece empate”, mas NÃO é
Se cada elemento está em um **stacking context diferente**, você não está comparando “maçã com maçã”.
Ex.: um pai com `transform`/`opacity`/`z-index` cria um novo contexto e pode “prender” o filho, mesmo com `z-index: 9999`.

Checklist rápido:
- Os dois elementos têm o **mesmo ancestral que define o contexto**?
- Algum ancestral de um deles tem `transform`/`opacity < 1`/`filter`/`isolation`/`position+z-index`?

### ℹ️ Observação (pra não confundir)
`z-index` é só **uma parte** da ordem de pintura. Em empates, entram regras de pintura do browser (inclui ordem no DOM e categorias do layout).  
Para uso prático, a regra “**quem vem depois no HTML fica por cima**” resolve a maioria dos casos dentro do mesmo contexto.
