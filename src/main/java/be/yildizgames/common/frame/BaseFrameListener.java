/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2018 Grégory Van den Borre
 *
 *  More infos available: https://www.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */

package be.yildizgames.common.frame;

import be.yildizgames.common.time.Timer;

/**
 * Listen when a frame starts and finishes, the frame end method provide the
 * time since the last frame.
 *
 * @author Grégory Van den Borre
 */
public abstract class BaseFrameListener implements FrameListener {

    /**
     * Time to compute the time since last call.
     */
    private final Timer timer;

    /**
     * Simple constructor.
     */
    public BaseFrameListener() {
        super();
        this.timer = new Timer();
    }

    /**
     * Called when a frame ends.
     *
     * @return <code>false</code> if the listener has finished his job and must
     * be removed from the notify list.
     */
    @Override
    public final boolean frameEnded() {
        return this.frameEnded(this.timer.getActionTime());
    }

}
