package fr.iutlens.mmi.invader;

import android.graphics.RectF;

import java.util.List;

import fr.iutlens.mmi.invader.utils.SpriteSheet;

/**
 * Created by dubois on 05/12/2018.
 */

class Canon extends Sprite {
    public static final int SPEED = 12;
    private final List<Projectile> laser;
    private final int dxLaser;
    private final int dyLaser;
    int vx = 0;
    private int derniertire;

    Canon(int id, float x, float y, List<Projectile> laser) {
        super(id, x, y);
        this.laser = laser;
        final SpriteSheet laserSprite = SpriteSheet.get(R.mipmap.laser);
        dxLaser = sprite.w/2- laserSprite.w/2;
        dyLaser = -laserSprite.h;
    }

    @Override
    public boolean act() {
        RectF bounds = getBoundingBox();
        int dx = vx * SPEED;
        if (bounds.left+dx>0 && bounds.right+dx< GameView.SIZE_X){
            x += dx;
        } else {
            vx = 0;
        }
        derniertire= derniertire+1;
        return hit;
    }

    public void setDirection(int i) {
        vx += i;
        if (vx<-1) vx = -1;
        else if (vx>1) vx = 1;
    }


    public void fire() {

        if (derniertire > 15) {
            laser.add(new Projectile(R.mipmap.laser, x + dxLaser, y + dyLaser, -20));
            derniertire=0;
        }
    }


   public void testIntersection(List<Projectile> missile) {
        for(Projectile p : missile){
            RectF bbox = p.getBoundingBox();
            if (bbox.intersect(getBoundingBox())) {
                hit = true;
                p.hit = true;
            }
        }

    }

}


