import React from 'react';

const MenuItem = ({name, type, points, date, url}) => (
  <div className="task">
    <div
      className={`${name} menu-item`}
    >
      <div className='content'>
        <span className='title'>{name}</span>
        <span>{type + " "}</span>
        <span>{points + " "}</span>
        <span>{date + " "}</span>
      </div>
    </div>
  </div>
  );
  
  export default MenuItem;