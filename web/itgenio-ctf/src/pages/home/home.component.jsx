import React from 'react';
import './home.style.css';
import Name_comp from '../../components/name-surname/name.component';
import Form_Flag from '../../components/enter-flag/inpt.component';
const Home_Page = () => (
    <div className="Home">
        <a id="about">Наш проект называется Itgen.io CTF,
        на нашем сайте вы можете найти
        самые трудные и интересные задачки на любые темы.
        Как проходить задачи: Вам следует находить флаги и отправлять их,
        этим Вы будете получать очки за правильные флаги,
        5 участников набравшие наибольшее количество очков
        получат бонусы и маленькие призы от Itgen.io Удачи!</a>
        <Name_comp></Name_comp>
        <div className="directions">
            <a id="python">Python </a>
            <a id="security">Информационная безопасность </a>
            <a id="java">Java</a>
        </div>
        <Form_Flag></Form_Flag>
    </div>    
)
export default Home_Page;