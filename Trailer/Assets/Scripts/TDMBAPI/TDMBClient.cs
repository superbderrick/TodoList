using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TDMBClient
{
    private static string apiKey = "4af16b90d75b1d6226d4cb497b4e98b7";

    private struct Auth
    {
        static int accountId = 0;
        static string requestToken = "";
        static string sessionId = "";
    }

    private struct EndPointsURL
    {
        static string baseURL = "https://api.themoviedb.org/3";
        static string apiKeyParam = "?api_key=" + apiKey;

    }

    enum EndPoints
    {
         getWatchlist,
         getFavorites,
         getRequestToken,
         login,
         createSessionId,
         logout,
         webAuth,
         search,
         markWatchlist,
         markFavorite
    }

    private static string ConvertString(EndPoints type)
    {
        int finalType = (int)type;

        switch (finalType)
        {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
                
                break;
        }

        return "";
    }

            //case .getWatchlist: return Endpoints.base + "/account/\(Auth.accountId)/watchlist/movies" + Endpoints.apiKeyParam + "&session_id=\(Auth.sessionId)"
            //case .getFavorites:
            //    return Endpoints.base + "/account/\(Auth.accountId)/favorite/movies" + Endpoints.apiKeyParam + "&session_id=\(Auth.sessionId)"
            //case .getRequestToken:
            //    return Endpoints.base + "/authentication/token/new" + Endpoints.apiKeyParam
            //case .login:
            //    return Endpoints.base + "/authentication/token/validate_with_login" + Endpoints.apiKeyParam
            //case .createSessionId:
            //    return Endpoints.base + "/authentication/session/new" + Endpoints.apiKeyParam
            //case .logout:
            //    return Endpoints.base + "/authentication/session" + Endpoints.apiKeyParam
            //case .webAuth:
            //    return "https://www.themoviedb.org/authenticate/\(Auth.requestToken)?redirect_to=themoviemanager:authenticate"
            //case .search(let query) :
            //    return Endpoints.base + "/search/movie" + Endpoints.apiKeyParam + "&query=\(query.addingPercentEncoding(withAllowedCharacters: .urlQueryAllowed) ?? ""))"
            //case .markWatchlist:
            //    return Endpoints.base + "/account/\(Auth.accountId)/watchlist" + Endpoints.apiKeyParam + "&session_id=\(Auth.sessionId)"
            //case .markFavorite:
            //    return Endpoints.base + "/account/\(Auth.accountId)/favorite" + Endpoints.apiKeyParam + "&session_id=\(Auth.sessionId)"
            //case .posterImage(let posterPath) :
            //    return "https://image.tmdb.org/t/p/w500/" + posterPath


    public TDMBClient()
    {
    
    }

}
