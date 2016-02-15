package de.kempkensebastian.poolday.A04klassen

/**
  * Created by sebastiankempken on 13.02.16.
  */

package Provinzial{
    class MitarbeiterPool{
      private[Provinzial] var name:String = _
      private[this] var secrets = null

      def redetMit(kollege: MitarbeiterPool) = {
        println(kollege.name)
        print(secrets)
        //println(kollegen.secrets)
      }
    }

    class MitarbeiterLinie{
      def redetMit(kollege: MitarbeiterPool): Unit ={
        println(kollege.name)
      }
    }
}

