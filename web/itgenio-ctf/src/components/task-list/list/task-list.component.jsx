import React from 'react';
import MenuItem from './item/task-item.component';
import './task-list.style.css'
class TaskList extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            tasks: [
                {
                    name: "Name",
                    type: "Type",
                    points: "Points",
                    date: "00/00/2020 22:00",
                    url: "/task"
                }
            ]
        }
    }
    render(){
        return(
        <div className='directory-menu'>
            {this.state.tasks.map(({name, ...otherSectionProps }) => (
            <MenuItem key={name} {...otherSectionProps} />
        ))}
        </div>
        )
    }

}
export default TaskList;