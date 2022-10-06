import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Button, Paper } from '@mui/material';






export default function Zamestnanec() {
  const [meno,setMeno] =React.useState('')
  const [priezvisko,setPriezvisko] = React.useState('')
  const [sex,setSex] = React.useState('')
  const [datum_narodenia,setDatum_narodenia] = React.useState('')
  const [datum_nastupu,setDatum_nastupu] = React.useState('')
  const stlac=(e)=>{
    e.preventDefault()
    const zamestnanec={meno,priezvisko,sex,datum_narodenia,datum_nastupu}
    console.log(zamestnanec)
    fetch("http://localhost:8080/uloz",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(zamestnanec)
    }).then(()=>{
      console.log("novy zamestnanec pridany")
    })
  }
  return (
    

    <Box
      component="form"
      
      
        sx={{
        'st': { 


          m: 1,
          
          

          display:'flex',
          alignItems:'stretch',
          alignContent: 'space-evenly',
          
          justifyContent: 'center',
          border: 'solid #5B6Dcd 5px',
          
         },
      }}
      noValidate
      autoComplete="off"
      > 
      <Paper elevation={5}style ={{padding:'50px  ', display:'flex',flexDirection:'column',alignContent:'center',alignItems:'center'}} >
      <h1 style= {{color:"blue",}}>Zamestnanec</h1>
    
      <TextField id="outlined-basic" label="Meno" variant="outlined" style={{paddingBottom:'10px'}}
      value={meno}
      onChange={(e)=>setMeno(e.target.value)}
      />
      <TextField id="outlined-basic" label="Priezvisko" variant="outlined" style={{paddingBottom:'10px'}}
      value={priezvisko}
      onChange={(e)=>setPriezvisko(e.target.value)}
      />
      <TextField id="outlined-basic" label="Sex" variant="outlined" style={{paddingBottom:'10px',alignItems:'center'}}
      value={sex}
      onChange={(e)=>setSex(e.target.value)}
      />
      <TextField
        id="date"
        label="Datum nastupu"
        type="date"
       
        sx={{ paddingBottom:'10px'}}
        
        
        InputLabelProps={{
          shrink: true,
        }}
        
        value={datum_nastupu}
        onChange={(e)=>setDatum_nastupu(e.target.value)}
      />
      <TextField
        id="date"
        label="Datum narodenia"
        type="date"
        
        sx={{ paddingBottom:'10px'}}
        InputLabelProps={{
          shrink: true,
        }}
        
        value={datum_narodenia}
        onChange={(e)=>setDatum_narodenia(e.target.value)}
      />
      <Button variant="contained" onClick ={stlac}>
        Pridat Zamestnanca
      </Button>
      </Paper>
    </Box>
  );
}
