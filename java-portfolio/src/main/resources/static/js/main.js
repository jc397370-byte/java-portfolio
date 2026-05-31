// Scroll reveal animation
const observer = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add('visible');
    }
  });
}, { threshold: 0.1 });

document.querySelectorAll('.section-title, .about-text, .stat, .skill-tag, .project-card')
  .forEach(el => {
    el.classList.add('reveal');
    observer.observe(el);
  });

// Smooth active nav highlight
const sections = document.querySelectorAll('section[id]');
const navLinks = document.querySelectorAll('.nav-links a');

window.addEventListener('scroll', () => {
  let current = '';
  sections.forEach(s => {
    if (window.scrollY >= s.offsetTop - 200) current = s.id;
  });
  navLinks.forEach(a => {
    a.style.color = a.getAttribute('href') === '#' + current ? 'var(--accent)' : '';
  });
});

// Typing effect on hero tag
const tag = document.querySelector('.hero-tag');
if (tag) {
  const text = tag.textContent;
  tag.textContent = '';
  let i = 0;
  const type = () => {
    if (i < text.length) { tag.textContent += text[i++]; setTimeout(type, 40); }
  };
  setTimeout(type, 400);
}
