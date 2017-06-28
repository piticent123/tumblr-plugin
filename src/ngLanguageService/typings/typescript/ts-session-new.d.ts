import { IDETypeScriptSession } from "./util";
import { HolderContainer } from "./compile-info-holder";
import { DefaultOptionsHolder } from "./ts-default-options";
export declare function getSessionNew(TypeScriptSession: typeof IDETypeScriptSession, TypeScriptProjectService: typeof ts.server.ProjectService, TypeScriptCommandNames: typeof ts.server.CommandNames, logger: ts.server.Logger, host: ts.server.ServerHost, ts_impl: typeof ts, defaultOptionsHolder: DefaultOptionsHolder, mainFile: any, projectEmittedWithAllFiles: HolderContainer): ts.server.Session;
