import React from 'react';
import FormInput from '../form-input/form-input.component';
import './name.style.css' 
class SignIn extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            email: '',
        }
    }
    handleSubmit = event => {
        event.preventDefault()
        this.setState({email:''})
    }
    handleChange = event => {
        const {value, name} = event.target;
        this.setState({[name]:value})
    }
    render(){
        return(
            <div className='sign-in'>
                <h2>Для отправки флагов, ввведите Ваш e-mail</h2>
                <form onSubmit={this.handleSubmit}>
                    <FormInput
                    name="email"
                    value={this.state.email}
                    handleChange={this.handleChange}
                    label="Email"
                    required>
                    </FormInput>
                </form>
            </div>
        );
    }
}

export default SignIn;