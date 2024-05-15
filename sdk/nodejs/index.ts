// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./arn";
export { GetArnArgs, GetArnResult, GetArnOutputArgs } from "./getArn";
export const getArn: typeof import("./getArn").getArn = null as any;
export const getArnOutput: typeof import("./getArn").getArnOutput = null as any;
utilities.lazyLoad(exports, ["getArn","getArnOutput"], () => require("./getArn"));

export { GetAvailabilityZoneArgs, GetAvailabilityZoneResult, GetAvailabilityZoneOutputArgs } from "./getAvailabilityZone";
export const getAvailabilityZone: typeof import("./getAvailabilityZone").getAvailabilityZone = null as any;
export const getAvailabilityZoneOutput: typeof import("./getAvailabilityZone").getAvailabilityZoneOutput = null as any;
utilities.lazyLoad(exports, ["getAvailabilityZone","getAvailabilityZoneOutput"], () => require("./getAvailabilityZone"));

export { GetAvailabilityZonesArgs, GetAvailabilityZonesResult, GetAvailabilityZonesOutputArgs } from "./getAvailabilityZones";
export const getAvailabilityZones: typeof import("./getAvailabilityZones").getAvailabilityZones = null as any;
export const getAvailabilityZonesOutput: typeof import("./getAvailabilityZones").getAvailabilityZonesOutput = null as any;
utilities.lazyLoad(exports, ["getAvailabilityZones","getAvailabilityZonesOutput"], () => require("./getAvailabilityZones"));

export { GetBillingServiceAccountArgs, GetBillingServiceAccountResult, GetBillingServiceAccountOutputArgs } from "./getBillingServiceAccount";
export const getBillingServiceAccount: typeof import("./getBillingServiceAccount").getBillingServiceAccount = null as any;
export const getBillingServiceAccountOutput: typeof import("./getBillingServiceAccount").getBillingServiceAccountOutput = null as any;
utilities.lazyLoad(exports, ["getBillingServiceAccount","getBillingServiceAccountOutput"], () => require("./getBillingServiceAccount"));

export { GetCallerIdentityArgs, GetCallerIdentityResult, GetCallerIdentityOutputArgs } from "./getCallerIdentity";
export const getCallerIdentity: typeof import("./getCallerIdentity").getCallerIdentity = null as any;
export const getCallerIdentityOutput: typeof import("./getCallerIdentity").getCallerIdentityOutput = null as any;
utilities.lazyLoad(exports, ["getCallerIdentity","getCallerIdentityOutput"], () => require("./getCallerIdentity"));

export { GetDefaultTagsArgs, GetDefaultTagsResult, GetDefaultTagsOutputArgs } from "./getDefaultTags";
export const getDefaultTags: typeof import("./getDefaultTags").getDefaultTags = null as any;
export const getDefaultTagsOutput: typeof import("./getDefaultTags").getDefaultTagsOutput = null as any;
utilities.lazyLoad(exports, ["getDefaultTags","getDefaultTagsOutput"], () => require("./getDefaultTags"));

export { GetIpRangesArgs, GetIpRangesResult, GetIpRangesOutputArgs } from "./getIpRanges";
export const getIpRanges: typeof import("./getIpRanges").getIpRanges = null as any;
export const getIpRangesOutput: typeof import("./getIpRanges").getIpRangesOutput = null as any;
utilities.lazyLoad(exports, ["getIpRanges","getIpRangesOutput"], () => require("./getIpRanges"));

export { GetPartitionArgs, GetPartitionResult, GetPartitionOutputArgs } from "./getPartition";
export const getPartition: typeof import("./getPartition").getPartition = null as any;
export const getPartitionOutput: typeof import("./getPartition").getPartitionOutput = null as any;
utilities.lazyLoad(exports, ["getPartition","getPartitionOutput"], () => require("./getPartition"));

export { GetRegionArgs, GetRegionResult, GetRegionOutputArgs } from "./getRegion";
export const getRegion: typeof import("./getRegion").getRegion = null as any;
export const getRegionOutput: typeof import("./getRegion").getRegionOutput = null as any;
utilities.lazyLoad(exports, ["getRegion","getRegionOutput"], () => require("./getRegion"));

export { GetRegionsArgs, GetRegionsResult, GetRegionsOutputArgs } from "./getRegions";
export const getRegions: typeof import("./getRegions").getRegions = null as any;
export const getRegionsOutput: typeof import("./getRegions").getRegionsOutput = null as any;
utilities.lazyLoad(exports, ["getRegions","getRegionsOutput"], () => require("./getRegions"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export * from "./region";
export * from "./tags";
export * from "./utils";

// Export enums:
export * from "./types/enums";

// Export sub-modules:
import * as accessanalyzer from "./accessanalyzer";
import * as account from "./account";
import * as acm from "./acm";
import * as acmpca from "./acmpca";
import * as alb from "./alb";
import * as amp from "./amp";
import * as amplify from "./amplify";
import * as apigateway from "./apigateway";
import * as apigatewayv2 from "./apigatewayv2";
import * as appautoscaling from "./appautoscaling";
import * as appconfig from "./appconfig";
import * as appflow from "./appflow";
import * as appintegrations from "./appintegrations";
import * as applicationinsights from "./applicationinsights";
import * as applicationloadbalancing from "./applicationloadbalancing";
import * as appmesh from "./appmesh";
import * as apprunner from "./apprunner";
import * as appstream from "./appstream";
import * as appsync from "./appsync";
import * as athena from "./athena";
import * as auditmanager from "./auditmanager";
import * as autoscaling from "./autoscaling";
import * as autoscalingplans from "./autoscalingplans";
import * as backup from "./backup";
import * as batch from "./batch";
import * as bcmdata from "./bcmdata";
import * as bedrock from "./bedrock";
import * as bedrockfoundation from "./bedrockfoundation";
import * as bedrockmodel from "./bedrockmodel";
import * as budgets from "./budgets";
import * as cfg from "./cfg";
import * as chime from "./chime";
import * as chimesdkmediapipelines from "./chimesdkmediapipelines";
import * as cleanrooms from "./cleanrooms";
import * as cloud9 from "./cloud9";
import * as cloudcontrol from "./cloudcontrol";
import * as cloudformation from "./cloudformation";
import * as cloudfront from "./cloudfront";
import * as cloudhsmv2 from "./cloudhsmv2";
import * as cloudsearch from "./cloudsearch";
import * as cloudtrail from "./cloudtrail";
import * as cloudwatch from "./cloudwatch";
import * as codeartifact from "./codeartifact";
import * as codebuild from "./codebuild";
import * as codecatalyst from "./codecatalyst";
import * as codecommit from "./codecommit";
import * as codedeploy from "./codedeploy";
import * as codeguruprofiler from "./codeguruprofiler";
import * as codegurureviewer from "./codegurureviewer";
import * as codepipeline from "./codepipeline";
import * as codestarconnections from "./codestarconnections";
import * as codestarnotifications from "./codestarnotifications";
import * as cognito from "./cognito";
import * as comprehend from "./comprehend";
import * as config from "./config";
import * as connect from "./connect";
import * as controltower from "./controltower";
import * as costexplorer from "./costexplorer";
import * as cur from "./cur";
import * as customerprofiles from "./customerprofiles";
import * as dataexchange from "./dataexchange";
import * as datapipeline from "./datapipeline";
import * as datasync from "./datasync";
import * as datazone from "./datazone";
import * as dax from "./dax";
import * as detective from "./detective";
import * as devicefarm from "./devicefarm";
import * as devopsguru from "./devopsguru";
import * as directconnect from "./directconnect";
import * as directoryservice from "./directoryservice";
import * as dlm from "./dlm";
import * as dms from "./dms";
import * as docdb from "./docdb";
import * as dynamodb from "./dynamodb";
import * as ebs from "./ebs";
import * as ec2 from "./ec2";
import * as ec2clientvpn from "./ec2clientvpn";
import * as ec2transitgateway from "./ec2transitgateway";
import * as ecr from "./ecr";
import * as ecrpublic from "./ecrpublic";
import * as ecs from "./ecs";
import * as efs from "./efs";
import * as eks from "./eks";
import * as elasticache from "./elasticache";
import * as elasticbeanstalk from "./elasticbeanstalk";
import * as elasticsearch from "./elasticsearch";
import * as elastictranscoder from "./elastictranscoder";
import * as elb from "./elb";
import * as emr from "./emr";
import * as emrcontainers from "./emrcontainers";
import * as emrserverless from "./emrserverless";
import * as evidently from "./evidently";
import * as finspace from "./finspace";
import * as fis from "./fis";
import * as fms from "./fms";
import * as fsx from "./fsx";
import * as gamelift from "./gamelift";
import * as glacier from "./glacier";
import * as globalaccelerator from "./globalaccelerator";
import * as glue from "./glue";
import * as grafana from "./grafana";
import * as guardduty from "./guardduty";
import * as iam from "./iam";
import * as identitystore from "./identitystore";
import * as imagebuilder from "./imagebuilder";
import * as inspector from "./inspector";
import * as inspector2 from "./inspector2";
import * as iot from "./iot";
import * as ivs from "./ivs";
import * as ivschat from "./ivschat";
import * as kendra from "./kendra";
import * as keyspaces from "./keyspaces";
import * as kinesis from "./kinesis";
import * as kinesisanalyticsv2 from "./kinesisanalyticsv2";
import * as kms from "./kms";
import * as lakeformation from "./lakeformation";
import * as lambda from "./lambda";
import * as lb from "./lb";
import * as lex from "./lex";
import * as licensemanager from "./licensemanager";
import * as lightsail from "./lightsail";
import * as location from "./location";
import * as m2 from "./m2";
import * as macie from "./macie";
import * as macie2 from "./macie2";
import * as mediaconvert from "./mediaconvert";
import * as medialive from "./medialive";
import * as mediapackage from "./mediapackage";
import * as mediastore from "./mediastore";
import * as memorydb from "./memorydb";
import * as mq from "./mq";
import * as msk from "./msk";
import * as mskconnect from "./mskconnect";
import * as mwaa from "./mwaa";
import * as neptune from "./neptune";
import * as networkfirewall from "./networkfirewall";
import * as networkmanager from "./networkmanager";
import * as oam from "./oam";
import * as opensearch from "./opensearch";
import * as opensearchingest from "./opensearchingest";
import * as opsworks from "./opsworks";
import * as organizations from "./organizations";
import * as outposts from "./outposts";
import * as pinpoint from "./pinpoint";
import * as pipes from "./pipes";
import * as polly from "./polly";
import * as pricing from "./pricing";
import * as qldb from "./qldb";
import * as quicksight from "./quicksight";
import * as ram from "./ram";
import * as rbin from "./rbin";
import * as rds from "./rds";
import * as redshift from "./redshift";
import * as redshiftdata from "./redshiftdata";
import * as redshiftserverless from "./redshiftserverless";
import * as rekognition from "./rekognition";
import * as resourceexplorer from "./resourceexplorer";
import * as resourcegroups from "./resourcegroups";
import * as resourcegroupstaggingapi from "./resourcegroupstaggingapi";
import * as rolesanywhere from "./rolesanywhere";
import * as route53 from "./route53";
import * as route53domains from "./route53domains";
import * as route53recoverycontrol from "./route53recoverycontrol";
import * as route53recoveryreadiness from "./route53recoveryreadiness";
import * as rum from "./rum";
import * as s3 from "./s3";
import * as s3control from "./s3control";
import * as s3outposts from "./s3outposts";
import * as sagemaker from "./sagemaker";
import * as scheduler from "./scheduler";
import * as schemas from "./schemas";
import * as secretsmanager from "./secretsmanager";
import * as securityhub from "./securityhub";
import * as securitylake from "./securitylake";
import * as serverlessrepository from "./serverlessrepository";
import * as servicecatalog from "./servicecatalog";
import * as servicediscovery from "./servicediscovery";
import * as servicequotas from "./servicequotas";
import * as ses from "./ses";
import * as sesv2 from "./sesv2";
import * as sfn from "./sfn";
import * as shield from "./shield";
import * as signer from "./signer";
import * as simpledb from "./simpledb";
import * as sns from "./sns";
import * as sqs from "./sqs";
import * as ssm from "./ssm";
import * as ssmcontacts from "./ssmcontacts";
import * as ssmincidents from "./ssmincidents";
import * as ssoadmin from "./ssoadmin";
import * as storagegateway from "./storagegateway";
import * as swf from "./swf";
import * as synthetics from "./synthetics";
import * as timestreamwrite from "./timestreamwrite";
import * as transcribe from "./transcribe";
import * as transfer from "./transfer";
import * as types from "./types";
import * as verifiedaccess from "./verifiedaccess";
import * as verifiedpermissions from "./verifiedpermissions";
import * as vpc from "./vpc";
import * as vpclattice from "./vpclattice";
import * as waf from "./waf";
import * as wafregional from "./wafregional";
import * as wafv2 from "./wafv2";
import * as worklink from "./worklink";
import * as workspaces from "./workspaces";
import * as xray from "./xray";

export {
    accessanalyzer,
    account,
    acm,
    acmpca,
    alb,
    amp,
    amplify,
    apigateway,
    apigatewayv2,
    appautoscaling,
    appconfig,
    appflow,
    appintegrations,
    applicationinsights,
    applicationloadbalancing,
    appmesh,
    apprunner,
    appstream,
    appsync,
    athena,
    auditmanager,
    autoscaling,
    autoscalingplans,
    backup,
    batch,
    bcmdata,
    bedrock,
    bedrockfoundation,
    bedrockmodel,
    budgets,
    cfg,
    chime,
    chimesdkmediapipelines,
    cleanrooms,
    cloud9,
    cloudcontrol,
    cloudformation,
    cloudfront,
    cloudhsmv2,
    cloudsearch,
    cloudtrail,
    cloudwatch,
    codeartifact,
    codebuild,
    codecatalyst,
    codecommit,
    codedeploy,
    codeguruprofiler,
    codegurureviewer,
    codepipeline,
    codestarconnections,
    codestarnotifications,
    cognito,
    comprehend,
    config,
    connect,
    controltower,
    costexplorer,
    cur,
    customerprofiles,
    dataexchange,
    datapipeline,
    datasync,
    datazone,
    dax,
    detective,
    devicefarm,
    devopsguru,
    directconnect,
    directoryservice,
    dlm,
    dms,
    docdb,
    dynamodb,
    ebs,
    ec2,
    ec2clientvpn,
    ec2transitgateway,
    ecr,
    ecrpublic,
    ecs,
    efs,
    eks,
    elasticache,
    elasticbeanstalk,
    elasticsearch,
    elastictranscoder,
    elb,
    emr,
    emrcontainers,
    emrserverless,
    evidently,
    finspace,
    fis,
    fms,
    fsx,
    gamelift,
    glacier,
    globalaccelerator,
    glue,
    grafana,
    guardduty,
    iam,
    identitystore,
    imagebuilder,
    inspector,
    inspector2,
    iot,
    ivs,
    ivschat,
    kendra,
    keyspaces,
    kinesis,
    kinesisanalyticsv2,
    kms,
    lakeformation,
    lambda,
    lb,
    lex,
    licensemanager,
    lightsail,
    location,
    m2,
    macie,
    macie2,
    mediaconvert,
    medialive,
    mediapackage,
    mediastore,
    memorydb,
    mq,
    msk,
    mskconnect,
    mwaa,
    neptune,
    networkfirewall,
    networkmanager,
    oam,
    opensearch,
    opensearchingest,
    opsworks,
    organizations,
    outposts,
    pinpoint,
    pipes,
    polly,
    pricing,
    qldb,
    quicksight,
    ram,
    rbin,
    rds,
    redshift,
    redshiftdata,
    redshiftserverless,
    rekognition,
    resourceexplorer,
    resourcegroups,
    resourcegroupstaggingapi,
    rolesanywhere,
    route53,
    route53domains,
    route53recoverycontrol,
    route53recoveryreadiness,
    rum,
    s3,
    s3control,
    s3outposts,
    sagemaker,
    scheduler,
    schemas,
    secretsmanager,
    securityhub,
    securitylake,
    serverlessrepository,
    servicecatalog,
    servicediscovery,
    servicequotas,
    ses,
    sesv2,
    sfn,
    shield,
    signer,
    simpledb,
    sns,
    sqs,
    ssm,
    ssmcontacts,
    ssmincidents,
    ssoadmin,
    storagegateway,
    swf,
    synthetics,
    timestreamwrite,
    transcribe,
    transfer,
    types,
    verifiedaccess,
    verifiedpermissions,
    vpc,
    vpclattice,
    waf,
    wafregional,
    wafv2,
    worklink,
    workspaces,
    xray,
};
pulumi.runtime.registerResourcePackage("aws", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:aws") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
