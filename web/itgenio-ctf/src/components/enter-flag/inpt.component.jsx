import React from 'react';
import './inpt.style.css'
const Form_Flag = () => (
    <div className="flagEntry">
        <input type="text"
        id="auth-flag"
        class="form-control"
        placeholder="flag{ ... }"
        data-toggle="tooltip"
        data-placement="bottom"
        title=""   
        data-original-title="Enter the flag.">
    </input>
    <button id="btn" name="Send">Send</button>
    </div>
    
)

export default Form_Flag;