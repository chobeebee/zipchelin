/* 메인 베너 */
var swiper = new Swiper(".main_banner", {
  slidesPerView: 1,
  spaceBetween: 10,
  speed: 850,
  loop: true,
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
  autoplay: {
    delay: 3500,
    disableOnInteraction: false,
  }
});


/* 집슐랭 픽 */
var swiper = new Swiper(".zipPick", {
  slidesPerView: 1,
  spaceBetween: 30,
  speed: 600,
  loop: true,
  autoplay: {
    delay: 4000,
    disableOnInteraction: false,
  }
});

var swiper = new Swiper(".zipPick2", {
  slidesPerView: 1,
  spaceBetween: 30,
  speed: 600,
  loop: true,
  autoplay: {
    delay: 4600,
    disableOnInteraction: false,
  }
});

/* 요리 상담소 */
var swiper = new Swiper(".cookConsulSlide", {
  direction: "vertical",
  slidesPerView: 5,
  spaceBetween: 8,
  loop: true,
  autoplay: {
    delay: 2500,
    disableOnInteraction: false,
  }
});


/* 더보기 토글 버튼 */
function viewBtn() {
  let rankBtn = document.getElementsByClassName('rank_btn')[0];
  // 클릭할 때 마다, on 클래스 토글
  toggleClass(rankBtn, 'on');

  // 클래스에 on이 추가되어 있다면 컨텐츠 보이기
  if(rankBtn.className == 'rank_btn on') {
    document.getElementsByClassName('rank_row1')[0].style.display = "flex";
    document.getElementsByClassName('rank_row1')[1].style.display = "flex";
    rankBtn.textContent = '닫기';
  } else {
    // 클래스에 on이 없다면 컨텐츠 숨기기
    document.getElementsByClassName('rank_row1')[0].style.display = "none";
    document.getElementsByClassName('rank_row1')[1].style.display = "none";
    rankBtn.textContent = '더보기';
  }
}

/* 하트 토글 버튼 */
document.querySelectorAll('.fa-regular.fa-heart').forEach(function (icon) {
  icon.addEventListener('click', function () {
    this.classList.toggle('fa-regular');
    this.classList.toggle('fa-solid');
  });
});

// 토글 함수 추가
function toggleClass(element, className) {
  if(element.classList.contains(className)){
    element.classList.remove(className);
  }else{
    element.classList.add(className);
  };
}

function setInnerHTML() {
  const element = document.getElementById('rank_row1');
  element.innerHTML 
    = '<div style="color:blue">InnerHTML<div>';
} 

function setInnerText() {
  const element = document.getElementById('rank_row1');
  element.innerText 
    = '<div style="color:blue">InnerText<div>';
} 

function setTextContent() {
  const element = document.getElementById('rank_row1');
  element.textContent 
    = '<div style="color:blue">TextContent<div>';
} 