import * as React from 'react';

import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';








export default function BasicTextFields() {
    
  return (
    
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Meno" variant="outlined" />
      <TextField id="outlined-basic" label="Priezvisko" variant="outlined" />
      <TextField id="outlined-basic" label="Sex" variant="outlined" />
      <TextField id="outlined-basic" label="DatumNarodenia" variant="outlined" />
      
      
    </Box>
  );
}
