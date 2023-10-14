import { Divider } from '@mui/material'
import React from 'react'
import { Link } from 'react-router-dom'
import './Sidebar.scss'
import logo from '../img/LogoTransparent.png'

function Sidebar() {
  return (
    <div className='container'>
      <div>
        <Link to={"/"}><img src={logo} className='logo'/></Link>
      </div>
      <div>
        <Link to={"/"}><p>Home</p></Link>
      </div>
      <Divider />
    </div>
  )
}

export default Sidebar
