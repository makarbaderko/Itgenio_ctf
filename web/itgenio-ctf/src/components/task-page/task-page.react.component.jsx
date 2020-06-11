import React from "react";
import "./task-page.style.css";
const TaskPage = ({ title, condition, photo_url }) => (
  <div className="TaskPage">
    <h1>{title}</h1>
    <span>{condition}</span>
    <img src={photo_url} alt="TaskPhoto"></img>
  </div>
);
export default TaskPage;
