                  if(e.isPre()) {
                    stage2++;
                    if(stage == 2 || stage2>=2){
                        mc.thePlayer.motionY = 0;
                        mc.thePlayer.cameraYaw = (float) .1;
                        e.setOnGround(true);
                        MovementUtils.setSpeedStupid(MovementUtils.getBaseMoveSpeedStupid() * .9);
                    }
                    if (stage == 0) {
                        if (stage2 == 1) {
                            mc.thePlayer.motionY = 0.05;
                        }
                        if (stage2 == 3) {
                            mc.thePlayer.setPosition(mc.thePlayer.posX, mc.thePlayer.posY - 0.22, mc.thePlayer.posZ);
                            mc.thePlayer.posY -= mc.thePlayer.posY - mc.thePlayer.lastTickPosY;
                            mc.thePlayer.lastTickPosY -= mc.thePlayer.posY - mc.thePlayer.lastTickPosY;
                        }
                        if (stage2 == 4) {
                            mc.thePlayer.motionY = -0.481009647894567;
                            mc.thePlayer.posY -= mc.thePlayer.posY - mc.thePlayer.lastTickPosY;
                            mc.thePlayer.lastTickPosY -= mc.thePlayer.posY - mc.thePlayer.lastTickPosY;
                        }
                        if (stage2 == 5) {
                            mc.thePlayer.motionY = -0.481009647894567;
                            mc.thePlayer.posY -= mc.thePlayer.posY - mc.thePlayer.lastTickPosY;
                            mc.thePlayer.lastTickPosY -= mc.thePlayer.posY - mc.thePlayer.lastTickPosY;
                            stage = 1;
                        }
                    } 
