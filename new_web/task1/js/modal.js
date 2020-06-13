const modal = document.getElementById('modal');
const buttonOpen = document.getElementById('button-expert');
const close = document.getElementById('button-close');

buttonOpen.addEventListener('click', ()=>{
  modal.style.display = 'flex';
})

close.addEventListener('click', ()=>{
  modal.style.display = 'none';
})