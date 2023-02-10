import React from "react";
import styled from "styled-components";

const TogetherScreen = () => {
  return (
    <StyledDiv>
      {/* <h1>together</h1> */}
      <StageDiv>
        <MainDiv>주인공</MainDiv>
        <StageImg src="/img/stage2.png" alt="stage" />
      </StageDiv>
    </StyledDiv>
  );
};

const StyledDiv = styled.div`
  width: 80%;
  height: 90vh;
  color: white;
  background-color: black;
  /* position: relative; */
`;

const MainDiv = styled.div`
  width: 60vh;
  height: 40vh;
  background-color: green;
  border-radius: 50%;
  margin-top: 90px;
  margin-left: 400px;
  position: relative;
`;

const StageImg = styled.img`
  width: 80vh;
  height: 15vh;
  position: static;
`;

const StageDiv = styled.div`
  justify-content: center;
`;
export default TogetherScreen;
